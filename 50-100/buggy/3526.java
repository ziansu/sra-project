@java.lang.Override
public void setDuration(java.lang.Integer duration) {
    if ((duration != null) && (duration < 0))
        throw new java.lang.IllegalArgumentException("Duration must be positive, or null");
    
    assertManager();
    if (duration.equals(this.duration))
        return ;
    
    if (isSystemRequired())
        throw new java.lang.IllegalStateException((("Unable to change the embargo '" + (name)) + "' because it is required by the system."));
    
    this.duration = duration;
}