public void drive_inputs(double[] input) {
    if (_new_data)
        return ;
    
    _input = input;
    _new_data = true;
}