private <T> void saveYamlFileToDatabase(java.util.List<T> yamlList) {
    try {
        for (int i = 0; i < (yamlList.size()); i++) {
            com.avaje.ebean.Ebean.save(yamlList.get(i));
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
    }
}