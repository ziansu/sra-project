@java.lang.Override
public void onResponseListener(java.util.List<ru.elenabogoliub.currencyconverter.data.model.Valute> result, java.lang.Throwable error) {
    mValutes = result;
    if (((mValutes) != null) && ((mView) != null))
        mView.startMain();
    else
        if ((mView) == null) {
        }else
            if (error != null)
                mView.showErrorStub();
            
        
    
}