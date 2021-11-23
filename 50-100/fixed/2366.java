public static com.tt.sharedbaseclass.constant.Constant.WEEK valueOf(int value) {
    com.tt.sharedbaseclass.constant.Constant.WEEK result = null;
    switch (value) {
        case 1 :
            result = com.tt.sharedbaseclass.constant.Constant.WEEK.MON;
            break;
        case 2 :
            result = com.tt.sharedbaseclass.constant.Constant.WEEK.TUE;
            break;
        case 3 :
            result = com.tt.sharedbaseclass.constant.Constant.WEEK.WEN;
            break;
        case 4 :
            result = com.tt.sharedbaseclass.constant.Constant.WEEK.THU;
            break;
        case 5 :
            result = com.tt.sharedbaseclass.constant.Constant.WEEK.FRI;
            break;
        case 6 :
            result = com.tt.sharedbaseclass.constant.Constant.WEEK.STA;
            break;
        case 0 :
            result = com.tt.sharedbaseclass.constant.Constant.WEEK.SUN;
            break;
    }
    return result;
}