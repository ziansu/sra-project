public void actionPerformed(java.awt.event.ActionEvent e) {
    int index = GUI.view_acct.getSelectedIndex();
    java.lang.System.out.println(index);
    if (index >= 0) {
        GUI.currAccount = GUI.accounts.get(index);
        if ((GUI.currTab) == 1)
            GUI.initTableReports();
        else
            if ((GUI.currTab) == 2)
                GUI.initTableTransactions();
            
        
    }
}