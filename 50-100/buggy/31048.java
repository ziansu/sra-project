private void removeId(java.util.ArrayList<java.lang.Integer> ids, int id) {
    if ((ids.indexOf(id)) != (-1)) {
        return ;
    }
    if ((findIndexForId(ids, id)) != (-1)) {
        ids.add(findIndexForId(ids, id), id);
    }else {
        ids.add(id);
    }
}