public static void deleteCatalog(long id) throws exceptions.EntityCanNotBeDeleted, exceptions.EntityNotFoundException {
    if (id != (-6000)) {
        logics.template.Catalog catalog = logics.template.Catalog.catalogDAO.readById(id);
        for (models.template.CatalogQA catalogQA : catalog.getTemplates()) {
            catalogQA.setDeleted(true);
            catalogQA.setCatalog(null);
            logics.template.Catalog.catalogQADAO.persist(catalogQA);
        }
        logics.template.Catalog.catalogDAO.remove(logics.template.Catalog.catalogDAO.readById(id));
    }else {
        throw new exceptions.EntityCanNotBeDeleted("It is not possible to delete the Standard Catalog!");
    }
}