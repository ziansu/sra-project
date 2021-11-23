private static int checkOperation(char charToRead) {
    if (charToRead == '+')
        return 1;
    else
        if (charToRead == '-')
            return 2;
        else
            if (charToRead == '*')
                return 3;
            else
                if (charToRead == '/')
                    return 4;
                else
                    return -1;
                
            
        
    
}