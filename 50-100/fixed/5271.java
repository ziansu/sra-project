@java.lang.Override
public int changeStatus() {
    if ((this.health) <= 0) {
        this.status = 0;
    }else
        if ((this.toxic) == true) {
            this.status = 3;
            changeToxicStatus();
        }else
            if ((this.alcoholLevel) > 0) {
                this.status = 2;
            }else
                if ((this.alcoholLevel) == 0) {
                    this.status = 1;
                }
            
        
    
    return this.status;
}