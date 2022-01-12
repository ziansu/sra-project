@java.lang.Override
public void onClick(android.view.View v) {
    if (prod.preference) {
        for (int i = 0; i < (m.prefCurr.size()); i++) {
            if ((m.prefCurr.get(i).position) == groupPosition) {
                m.removeFromPrefs(i);
                break;
            }
        }
        holder.prefimg.setImageResource(R.drawable.addtopreference);
    }else {
        m.addToPrefs(groupPosition);
        holder.prefimg.setImageResource(R.drawable.selectedpreference);
    }
    prod.preference = !(prod.preference);
}