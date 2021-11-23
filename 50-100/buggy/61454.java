@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    com.example.android.starwarsv2.ItemView itemView;
    if (convertView == null) {
        itemView = new com.example.android.starwarsv2.ItemView(this.m_context, this.m_peopleList.get(position));
    }else {
        itemView = ((com.example.android.starwarsv2.ItemView) (convertView));
    }
    return itemView;
}