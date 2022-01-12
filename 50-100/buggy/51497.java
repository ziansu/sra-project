public char getSuffixChar(int sid, int ind) {
    int N = length();
    if ((ind + sid) >= N)
        return suffix[((ind + sid) - N)];
    else
        return suffix[(ind + sid)];
    
}