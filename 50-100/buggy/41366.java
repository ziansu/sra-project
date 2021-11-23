private void getCardByPages() throws java.io.IOException {
    minCardPage = calculateMinCardPage();
    for (int page = minCardPage; page <= (maxCardPage); page++) {
        if (com.thoughtworks.lhli.lovelive_rock.LoveLiveApp.getInstance().isNetworkAvailable()) {
            retrofit.Call<com.thoughtworks.lhli.lovelive_rock.model.MultipleCards> call = com.thoughtworks.lhli.lovelive_rock.Retrofit.getInstance().getCardService().getCardList(page);
            retrofit.Response<com.thoughtworks.lhli.lovelive_rock.model.MultipleCards> cardsResponse = call.execute();
            saveCardsToDatabase(cardsResponse);
        }else {
            java.lang.System.out.print("Get all cards failed.");
        }
    }
}