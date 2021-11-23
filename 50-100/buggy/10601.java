private int find_next_test_item(int CurrentTestItem) {
    int NextTestItemL = 0;
    boolean NeedTest = false;
    do {
        NextTestItemL = CurrentTestItem + 1;
        not_end_test_all = (NextTestItem) != (end_test_item);
        if (not_end_test_all) {
            NeedTest = fec_test_items_order[NextTestItem].test;
        }else {
            return -1;
        }
    } while (!NeedTest );
    return NextTestItemL;
}