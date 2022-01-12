@java.lang.Override
public void run() {
    closeProgressDialog();
    if ("province".equals(type)) {
        queryProvinces();
    }else
        if ("city".equals(type)) {
            queryCities();
        }else
            if ("county".equals(type)) {
                queryCounties();
            }
        
    
}