public static int fibofunny(int loop) {
    if (loop < 0)
        return 0;
    
    if (loop == 0)
        return 0;
    else
        if (loop == 1)
            return 1;
        else
            return (HelloWorld.fibofunny((loop - 1))) + (HelloWorld.fibofunny((loop - 2)));
        
    
}