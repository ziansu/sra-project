public void setTime(int t) {
    if (((startTime) <= t) && (t <= (endTime))) {
        hideContextPopups();
        time.set(t);
    }else
        if (t < (startTime))
            time.set(startTime);
        else
            if (t > (endTime))
                time.set(endTime);
            
        
    
}