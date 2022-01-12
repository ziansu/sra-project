private java.util.List<java.lang.String> sqliteLauseet() {
    java.util.ArrayList<java.lang.String> lista = new java.util.ArrayList<>();
    lista.add("PRAGMA foreign_keys = ON;");
    lista.add("CREATE TABLE categories (categoryId integer PRIMARY KEY, title varchar(255));");
    lista.add("CREATE TABLE subCategories (subCatId integer PRIMARY KEY, catId integer , title varchar(255), description varchar(1024), FOREIGN KEY(catId) REFERENCES categories(categoryId));");
    lista.add("CREATE TABLE threads (threadId integer PRIMARY KEY, subCategoryId integer , userId integer, title varchar(255), creationDate varchar(255), FOREIGN KEY(subCategoryId) REFERENCES subCategories(subCatId), FOREIGN KEY(userId) REFERENCES users(userId));");
    lista.add("CREATE TABLE posts (postId integer PRIMARY KEY, threadId integer , userId integer , timestamp varchar(255), body varchar(4096), FOREIGN KEY(threadId) REFERENCES threads(threadId), FOREIGN KEY(userId) REFERENCES users(userId));");
    lista.add("CREATE TABLE users (userId integer PRIMARY KEY, username varchar(255), password varchar(255), salt varchar(255), userLevel integer);");
    return lista;
}