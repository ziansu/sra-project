@java.lang.Override
public void accept(com.gif.example.silich.vladislav.giftask.model.GifResponse gifResponse) throws java.lang.Exception {
    gifList.clear();
    updateUserDataList(gifResponse.getData());
    progressBar.set(View.GONE);
}