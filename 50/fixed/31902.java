public void save_label(java.io.FileOutputStream fos, java.lang.Boolean withTime) {
    if (withTime)
        if (availableEngine())
            engine.save_label(fos);
        else
            save_label(fos);
        
    
}