void Close() {
    main.account a = IsAccount(0);
    if (a == null)
        return ;
    
    GetPin();
    for (; ; Wrong() , GetPin()) {
        if ((ReadAccount()) == (a.pin))
            break;
        
    }
    list.remove(java.lang.String.valueOf(a.id));
    Save();
}