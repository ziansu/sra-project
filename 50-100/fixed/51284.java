public void delete_file(java.lang.String name) throws files.no_such_file {
    for (files.directory_entry entry : files) {
        if (entry.name.equals(name)) {
            new java.io.File(file, entry.name).delete();
            files.remove(entry);
            (number_of_file)--;
        }
    }
    throw new files.files.no_such_file(name);
}