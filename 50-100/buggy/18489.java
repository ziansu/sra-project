public boolean isVisible(diy.uigeneric.data.Sample sample) {
    boolean b = true;
    if ((deleted) != null)
        b = ((sample.getDeleted()) == null) == (!(deleted));
    
    if ((category) != null)
        b = (sample.getCategory()) == (category);
    
    if ((query) != null)
        b = sample.getName().contains(query);
    
    return b;
}