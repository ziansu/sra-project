public void remove(int i) {
    if ((i < ((size) - 1)) && (i >= 0)) {
        int s = 0;
        boolean f = false;
        while (s < (size)) {
            if (s == i)
                f = true;
            
            if (f) {
                arr[s] = arr[(s + 1)];
            }
            s++;
        } 
        (size)--;
    }else
        java.lang.System.out.println("ERROR");
    
}