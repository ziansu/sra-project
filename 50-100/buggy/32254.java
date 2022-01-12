public static java.lang.String num2cn(int num) {
    if (num < 10) {
        return wmj.InnerLayer.MyTools.cnList[num];
    }else
        if (num < 20) {
            return (wmj.InnerLayer.MyTools.cnList[10]) + (wmj.InnerLayer.MyTools.cnList[(num - 10)]);
        }else {
            return ((wmj.InnerLayer.MyTools.cnList[(num / 10)]) + (wmj.InnerLayer.MyTools.cnList[10])) + (wmj.InnerLayer.MyTools.cnList[(num % 10)]);
        }
    
}