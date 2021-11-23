public ProcessInfo closest_preceding_finger(int node_id) {
    for (int i = 7; i >= 0; i--)
        if (contains(this.fingerTable[i].Id, ((this.Id) + 1), node_id))
            return this.fingerTable[i];
        
    
    return this.fingerTable[0];
}