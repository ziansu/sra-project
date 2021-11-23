@java.lang.Override
public int compareTo(edu.utexas.cs.nn.networks.hyperneat.HyperNEATUtil.VisualNode o) {
    if ((o.dead) && (this.dead))
        return 0;
    else
        if (o.dead)
            return 1;
        else
            if (this.dead)
                return -1;
            else
                return ((int) (java.lang.Math.signum(((o.activation) - (this.activation)))));
            
        
    
}