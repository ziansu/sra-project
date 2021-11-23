static final android.content.Context toContext(android.content.Context context) {
    if (context != null) {
        if (context instanceof android.app.Activity) {
        }else
            if (context instanceof android.app.Application) {
            }else
                if (context instanceof android.app.Service) {
                }else
                    if (context instanceof android.content.ContextWrapper) {
                        android.content.Context out = com.ath.fuel.FuelInjector.toContext(((android.content.ContextWrapper) (context)).getBaseContext());
                        if (out != null) {
                            context = out;
                        }
                    }
                
            
        
    }
    return context;
}