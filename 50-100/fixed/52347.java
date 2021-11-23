@java.lang.Override
public int compareTo(java.lang.Object o) {
    Message message = ((Message) (o));
    if ((getDelta()) > (message.getDelta()))
        return -1;
    else
        if ((getDelta()) < (message.getDelta()))
            return 1;
        
    
    return 0;
}