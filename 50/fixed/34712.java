private java.util.List<java.lang.Object> loadDataTaskBackground() {
    java.util.List<java.lang.Object> result = new java.util.ArrayList<java.lang.Object>();
    dev.sturmtruppen.bibliovale.businessLogic.GlobalConstants.genresMap = new dev.sturmtruppen.bibliovale.businessLogic.helpers.GenresMap();
    dev.sturmtruppen.bibliovale.businessLogic.GlobalConstants.authorsMap = new dev.sturmtruppen.bibliovale.businessLogic.helpers.AuthorsMap();
    result.add(true);
    return result;
}