void next() {
    if ((c) == '9')
        c = 'A';
    else
        if ((c) == 'Z')
            c = 'a';
        else
            if ((c) == 'z') {
                c = '0';
                if ((parent) == null)
                    parent = new ResProguard.Name();
                else
                    parent.next();
                
            }else
                (c)++;
            
        
    
}