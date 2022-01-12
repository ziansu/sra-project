public void run() {
    java.lang.String status = nearPlaces.status;
    if (status.equals("OK")) {
        if ((nearPlaces.results.size()) > 0) {
            if ((near) == null)
                near = nearPlaces.results.get(0);
            else
                if (!(near.equals(nearPlaces.results.get(0))))
                    near = nearPlaces.results.get(0);
                
            
        }else
            near = null;
        
    }
}