public void cleareDuplicates() {
    for (java.lang.Integer i = 0; i < (bestListEver.size()); i++)
        for (int j = i + 1; j < (bestListEver.size()); j++)
            if ((bestListEver.get(i)) == (bestListEver.get(j))) {
                bestListEver.remove(j);
                j--;
            }
        
    
}