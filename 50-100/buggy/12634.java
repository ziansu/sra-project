public int getInventorySize() {
    int highestSlot = getHighestSlot();
    if (highestSlot <= 9) {
        return 9;
    }else
        if (highestSlot < 18) {
            return 18;
        }else
            if (highestSlot < 27) {
                return 27;
            }else
                if (highestSlot < 36) {
                    return 36;
                }else
                    if (highestSlot < 45) {
                        return 45;
                    }else {
                        return 45;
                    }
                
            
        
    
}