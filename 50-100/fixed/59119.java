private android.view.View getViewPreMemorization(android.view.View convertView) {
    memorization.MemoryCell view;
    if ((convertView == null) || (!(convertView instanceof memorization.MemoryCell))) {
        view = new memorization.MemoryCell(context, null);
    }else
        view = ((memorization.MemoryCell) (convertView));
    
    view.setAsHiddenDataCell();
    return view;
}