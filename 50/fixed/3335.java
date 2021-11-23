public void delete() {
    rabbitArrayList.remove(((rabbitArrayList.size()) - 1));
    rabbitArrayList.trimToSize();
    (sum)--;
}