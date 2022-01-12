public void enqueue(Item item) {
    if (item == null)
        throw new java.lang.NullPointerException();
    
    if ((itemCount) == (qArray.length))
        resize((2 * (qArray.length)));
    
    qArray[((itemCount)++)] = item;
}