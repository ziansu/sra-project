void next() {
    if ((c) == '9')
        c = 'A';
    else
        if ((c) == 'Z')
            c = 'a';
        else
            if ((c) == 'z') {
                if ((parent) == null)
                    parent = new ResProguard.Name();
                else {
                    c = '0';
                    parent.next();
                }
            }else
                (c)++;
            
        
    
}