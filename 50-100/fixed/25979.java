public int limitProgress(int p) {
    if (p <= 50) {
        p = 0;
    }else
        if ((p > 50) && (p <= 150)) {
            p = 100;
        }else
            if ((p > 150) && (p <= 250)) {
                p = 200;
            }else
                if ((p > 250) && (p <= 350)) {
                    p = 300;
                }else
                    if (p > 350) {
                        p = 400;
                    }
                
            
        
    
    return p;
}