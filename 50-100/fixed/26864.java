private int[] getColorByStatus(int number) {
    switch (number) {
        case 0 :
            return new int[]{ R.drawable.red , R.drawable.green , R.drawable.yellow };
        case 1 :
            return new int[]{ R.drawable.green , R.drawable.yellow , R.drawable.red };
        case 2 :
            return new int[]{ R.drawable.yellow , R.drawable.red , R.drawable.green };
        default :
            return new int[]{ R.drawable.yellow , R.drawable.red , R.drawable.green };
    }
}