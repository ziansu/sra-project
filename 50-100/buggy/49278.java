@java.lang.Override
public void run() {
    closeProgressDialog();
    if ("province".equals(android.R.attr.type)) {
        queryProvinces();
    }else
        if ("city".equals(android.R.attr.type)) {
            queryCities();
        }else
            if ("county".equals(android.R.attr.type)) {
                queryCounties();
            }
        
    
}