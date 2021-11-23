public boolean isEmpty(int listId) {
    return (listId >= (data.length)) || (0 == (data[listId].position()));
}