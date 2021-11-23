private int find_next_test_item(int CurrentTestItem) {
    int NextTestItemL = 0;
    boolean NeedTest = false;
    NextTestItemL = CurrentTestItem + 1;
    do {
        not_end_test_all = NextTestItemL != (end_test_item);
        if (not_end_test_all) {
            NeedTest = fec_test_items_order[NextTestItemL].test;
            if (NeedTest) {
                break;
            }else {
                NextTestItemL++;
            }
        }else {
            return -1;
        }
    } while (!NeedTest );
    return NextTestItemL;
}