public void deleteEffect(int i) {
    while ((getIndexOfEffect(i)) != (-1)) {
        status.remove(getIndexOfEffect(i));
    } 
}