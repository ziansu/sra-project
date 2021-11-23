public Queue<E> enQueue(E e) {
    java.util.ArrayList<E> al = new java.util.ArrayList<E>();
    for (E item : elements)
        al.add(item);
    
    al.add(e);
    return new Queue<E>(al);
}