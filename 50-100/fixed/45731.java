public void removePortfolioItem(java.util.List<java.lang.Integer> ids) {
    for (int i = 0; i < (portfolio.size()); i++) {
        if (ids.contains(portfolio.get(i).getId())) {
            portfolio.remove(i);
        }
    }
}