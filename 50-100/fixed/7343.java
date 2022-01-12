@java.lang.Override
protected void onPostExecute(kz.mukhamedissa.exchangerates.data.response.ExchangeRateResponse response) {
    super.onPostExecute(response);
    if ((response.isSuccess()) && ((response.result) != null)) {
        kz.mukhamedissa.exchangerates.util.db.orm.ORMFactory.getArticleORM().delete(getBaseContext());
        kz.mukhamedissa.exchangerates.util.db.orm.ORMFactory.getArticleORM().insert(getBaseContext(), response.result);
    }
}