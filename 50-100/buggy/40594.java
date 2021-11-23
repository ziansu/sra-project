public void sortCategories(java.util.ArrayList<iths.com.food.model.ICategory> categories) {
    java.util.Collections.sort(categories, new java.util.Comparator<iths.com.food.model.ICategory>() {
        @java.lang.Override
        public int compare(iths.com.food.model.ICategory c1, iths.com.food.model.ICategory c2) {
            if ((c1.getAverageScore()) > (c2.getAverageScore()))
                return -1;
            else
                if ((c1.getAverageScore()) < (c2.getAverageScore()))
                    return 1;
                else
                    return 0;
                
            
        }
    });
}