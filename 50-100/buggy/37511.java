public ProcessInfo closest_preceding_finger(int node_id) {
    for (int i = 7; i >= 0; i--)
        if (this.ft_info[i].contains(this.fingerTable[i].Id))
            return this.fingerTable[i];
        
    
    return this.fingerTable[0];
}