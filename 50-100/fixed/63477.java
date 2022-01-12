void Clear() {
    main.account a = IsAccount(0);
    if (a == null)
        return ;
    
    list.put(java.lang.String.valueOf(a.id), new main.account(a.id, a.pin, a.type, a.enable, ((a.rest) + (a.pend)), 0, a.lim));
    Save();
}