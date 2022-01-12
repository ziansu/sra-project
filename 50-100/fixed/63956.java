public java.lang.String toString() {
    if ((mine) != 0) {
        return "X";
    }else
        if ((this.unRobot) != null) {
            return unRobot.toString();
        }else
            if (obstacle) {
                return "O";
            }else
                if ((base) == 1) {
                    return "b";
                }else
                    if ((base) == 2) {
                        return "B";
                    }
                
            
        
    
    return " ";
}