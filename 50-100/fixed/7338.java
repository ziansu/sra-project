@java.lang.Override
public void onClick(android.view.View v) {
    int position = ((java.lang.Integer) (v.getTag()));
    me.colinhowes.rollinitiative.CombatAdapter.CombatClickListener.EventType eventType;
    if ((v.getId()) == (R.id.ib_hp_minus_select)) {
        eventType = me.colinhowes.rollinitiative.CombatAdapter.CombatClickListener.EventType.DECREASE_HEALTH;
    }else
        if ((v.getId()) == (R.id.ib_hp_add_select)) {
            eventType = me.colinhowes.rollinitiative.CombatAdapter.CombatClickListener.EventType.INCREASE_HEALTH;
        }else {
            eventType = me.colinhowes.rollinitiative.CombatAdapter.CombatClickListener.EventType.ITEM_CLICK;
        }
    
    clickListener.onCombatClick(position, eventType);
}