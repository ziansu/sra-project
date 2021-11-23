private void traversal() {
    if ((gq.fokia.eatwhat.LoveCallBack.disLike) != null) {
        for (int i = 0; i < (gq.fokia.eatwhat.AllFoodFragment.foodList.size()); i++) {
            if (gq.fokia.eatwhat.LoveCallBack.disLike.equals(gq.fokia.eatwhat.AllFoodFragment.foodList.get(i).getName())) {
                p = i;
                gq.fokia.eatwhat.AllFoodFragment.foodList.get(p).setIsLike(0);
                break;
            }
        }
    }
}