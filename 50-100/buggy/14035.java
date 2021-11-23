public ru.spbau.shavkunov.hw6.MyTreeSetImpl<E>.Node next() {
    if ((right) != null) {
        return right.mostLeft();
    }
    ru.spbau.shavkunov.hw6.MyTreeSetImpl<E>.Node res = this;
    while ((res.parent.right) == res) {
        res = res.parent;
    } 
    return res.parent;
}