public void setY(double[] input, double Scale) {
    y = input;
    if (input == null)
        return ;
    
    yScale = (((y.length) - 1) / 200) / Scale;
}