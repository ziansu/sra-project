@java.lang.Override
public void onResponseListener(java.util.List<ru.elenabogoliub.currencyconverter.data.model.Valute> result, java.lang.Throwable error) {
    mValutes = result;
    if (((mValutes) != null) && ((mValutes.size()) > 0))
        mView.startMain();
    else
        mView.showErrorStub();
    
}