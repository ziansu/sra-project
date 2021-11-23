public void setNeedRecalculation(boolean b) {
    if (b == (getNeedRecalculation()))
        return ;
    
    if (b)
        (field_2_need_recalculation_and_id)++;
    else
        (field_2_need_recalculation_and_id)--;
    
}